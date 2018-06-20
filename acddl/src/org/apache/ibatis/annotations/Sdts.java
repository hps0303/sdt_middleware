package org.apache.ibatis.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface Sdts
{
  Sdt[] value();
}

/* Location:           C:\Users\ad\Desktop\cloudy-cddl-1.0.37.jar
 * Qualified Name:     org.apache.ibatis.annotations.Sdts
 * JD-Core Version:    0.6.1
 */