(ns com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager.spi.v1beta1 ResourceManagerRpc$Option]))

(def FILTER
  "Enum Constant.

  type: com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option"
  ResourceManagerRpc$Option/FILTER)

(def FIELDS
  "Enum Constant.

  type: com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option"
  ResourceManagerRpc$Option/FIELDS)

(def PAGE_SIZE
  "Enum Constant.

  type: com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option"
  ResourceManagerRpc$Option/PAGE_SIZE)

(def PAGE_TOKEN
  "Enum Constant.

  type: com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option"
  ResourceManagerRpc$Option/PAGE_TOKEN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ResourceManagerRpc.Option c : ResourceManagerRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option[]`"
  ([]
    (ResourceManagerRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option [^java.lang.String name]
    (ResourceManagerRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceManagerRpc$Option this]
    (-> this (.value))))

