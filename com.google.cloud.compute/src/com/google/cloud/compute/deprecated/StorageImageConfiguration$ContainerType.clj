(ns com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StorageImageConfiguration$ContainerType]))

(def TAR
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType"
  StorageImageConfiguration$ContainerType/TAR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageImageConfiguration.ContainerType c : StorageImageConfiguration.ContainerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType[]`"
  ([]
    (StorageImageConfiguration$ContainerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType [^java.lang.String name]
    (StorageImageConfiguration$ContainerType/valueOf name)))

