(ns com.google.cloud.compute.deprecated.ImageConfiguration$SourceType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageConfiguration$SourceType]))

(def RAW
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.ImageConfiguration$SourceType"
  ImageConfiguration$SourceType/RAW)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ImageConfiguration.SourceType c : ImageConfiguration.SourceType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.ImageConfiguration$SourceType[]`"
  ([]
    (ImageConfiguration$SourceType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.ImageConfiguration$SourceType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.ImageConfiguration$SourceType [^java.lang.String name]
    (ImageConfiguration$SourceType/valueOf name)))

