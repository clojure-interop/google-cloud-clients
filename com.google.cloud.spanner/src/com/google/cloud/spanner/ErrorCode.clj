(ns com.google.cloud.spanner.ErrorCode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ErrorCode]))

(def CANCELLED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/CANCELLED)

(def UNKNOWN
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/UNKNOWN)

(def INVALID_ARGUMENT
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/INVALID_ARGUMENT)

(def DEADLINE_EXCEEDED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/DEADLINE_EXCEEDED)

(def NOT_FOUND
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/NOT_FOUND)

(def ALREADY_EXISTS
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/ALREADY_EXISTS)

(def PERMISSION_DENIED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/PERMISSION_DENIED)

(def UNAUTHENTICATED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/UNAUTHENTICATED)

(def RESOURCE_EXHAUSTED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/RESOURCE_EXHAUSTED)

(def FAILED_PRECONDITION
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/FAILED_PRECONDITION)

(def ABORTED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/ABORTED)

(def OUT_OF_RANGE
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/OUT_OF_RANGE)

(def UNIMPLEMENTED
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/UNIMPLEMENTED)

(def INTERNAL
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/INTERNAL)

(def UNAVAILABLE
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/UNAVAILABLE)

(def DATA_LOSS
  "Enum Constant.

  type: com.google.cloud.spanner.ErrorCode"
  ErrorCode/DATA_LOSS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ErrorCode c : ErrorCode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.ErrorCode[]`"
  ([]
    (ErrorCode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.ErrorCode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.ErrorCode [^java.lang.String name]
    (ErrorCode/valueOf name)))

