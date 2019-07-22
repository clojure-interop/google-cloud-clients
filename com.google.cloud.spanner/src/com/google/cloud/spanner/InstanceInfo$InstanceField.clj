(ns com.google.cloud.spanner.InstanceInfo$InstanceField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceInfo$InstanceField]))

(def DISPLAY_NAME
  "Enum Constant.

  type: com.google.cloud.spanner.InstanceInfo$InstanceField"
  InstanceInfo$InstanceField/DISPLAY_NAME)

(def NODE_COUNT
  "Enum Constant.

  type: com.google.cloud.spanner.InstanceInfo$InstanceField"
  InstanceInfo$InstanceField/NODE_COUNT)

(def LABELS
  "Enum Constant.

  type: com.google.cloud.spanner.InstanceInfo$InstanceField"
  InstanceInfo$InstanceField/LABELS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (InstanceInfo.InstanceField c : InstanceInfo.InstanceField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.InstanceInfo$InstanceField[]`"
  ([]
    (InstanceInfo$InstanceField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.InstanceInfo$InstanceField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.InstanceInfo$InstanceField [^java.lang.String name]
    (InstanceInfo$InstanceField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo$InstanceField this]
    (-> this (.getSelector))))

