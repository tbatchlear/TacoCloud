package tacos.validator;

import org.springframework.stereotype.Component;
import tacos.Taco;

@Component
public class TacoValidator implements ValidatorInterface<Taco>
{
  @Override
  public boolean supports(Object object)
  {
    return object instanceof Taco;
  }

  @Override
  public void validate(Taco taco)
  {
    System.out.println("valid");
  }
}
