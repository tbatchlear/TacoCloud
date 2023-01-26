package tacos.validator;

public interface Supportable<T>
{
  boolean supports(T type);
}
