package tacos.validator;

import org.springframework.stereotype.Component;

@Component
public interface ValidatorInterface<T> extends Supportable<Object>
{
  void validate(T validation);
}
