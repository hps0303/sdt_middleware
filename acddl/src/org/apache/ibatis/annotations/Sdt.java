package org.apache.ibatis.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface Sdt
{
  String exp();

  int dbc();

  int tbc();

  String tbn();
}

/* Location:           C:\Users\ad\Desktop\cloudy-cddl-1.0.37.jar
 * Qualified Name:     org.apache.ibatis.annotations.Sdt
 * JD-Core Version:    0.6.1
 */