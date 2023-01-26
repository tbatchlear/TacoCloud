package tacos.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ValidationFactory
{
  @Autowired
  Collection<ValidatorInterface> validators;

  public void validate(Object object)
  {

    getValidator(object).validate(object);
  }

  public ValidatorInterface getValidator(Object object)
  {
    for (var validator : validators) {
      if (validator.supports(object)) {
        return validator;
      }
    }
    return null;
  }
}
