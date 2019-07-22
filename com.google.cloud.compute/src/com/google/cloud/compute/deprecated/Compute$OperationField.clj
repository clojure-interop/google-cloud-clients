(ns com.google.cloud.compute.deprecated.Compute$OperationField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$OperationField]))

(def CLIENT_OPERATION_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/CLIENT_OPERATION_ID)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/DESCRIPTION)

(def END_TIME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/END_TIME)

(def ERROR
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/ERROR)

(def HTTP_ERROR_MESSAGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/HTTP_ERROR_MESSAGE)

(def HTTP_ERROR_STATUS_CODE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/HTTP_ERROR_STATUS_CODE)

(def ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/ID)

(def INSERT_TIME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/INSERT_TIME)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/NAME)

(def OPERATION_TYPE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/OPERATION_TYPE)

(def PROGRESS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/PROGRESS)

(def REGION
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/REGION)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/SELF_LINK)

(def START_TIME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/START_TIME)

(def STATUS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/STATUS)

(def STATUS_MESSAGE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/STATUS_MESSAGE)

(def TARGET_ID
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/TARGET_ID)

(def TARGET_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/TARGET_LINK)

(def USER
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/USER)

(def WARNINGS
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/WARNINGS)

(def ZONE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$OperationField"
  Compute$OperationField/ZONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.OperationField c : Compute.OperationField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$OperationField[]`"
  ([]
    (Compute$OperationField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$OperationField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$OperationField [^java.lang.String name]
    (Compute$OperationField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$OperationField this]
    (-> this (.getSelector))))

