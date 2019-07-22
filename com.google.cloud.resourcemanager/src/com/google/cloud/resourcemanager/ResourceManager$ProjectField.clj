(ns com.google.cloud.resourcemanager.ResourceManager$ProjectField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManager$ProjectField]))

(def PROJECT_ID
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/PROJECT_ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/NAME)

(def LABELS
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/LABELS)

(def PROJECT_NUMBER
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/PROJECT_NUMBER)

(def STATE
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/STATE)

(def CREATE_TIME
  "Enum Constant.

  type: com.google.cloud.resourcemanager.ResourceManager$ProjectField"
  ResourceManager$ProjectField/CREATE_TIME)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ResourceManager.ProjectField c : ResourceManager.ProjectField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.resourcemanager.ResourceManager$ProjectField[]`"
  ([]
    (ResourceManager$ProjectField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.resourcemanager.ResourceManager$ProjectField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectField [^java.lang.String name]
    (ResourceManager$ProjectField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceManager$ProjectField this]
    (-> this (.getSelector))))

