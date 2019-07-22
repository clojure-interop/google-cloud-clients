(ns com.google.cloud.storage.Storage$PredefinedAcl
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$PredefinedAcl]))

(def AUTHENTICATED_READ
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/AUTHENTICATED_READ)

(def ALL_AUTHENTICATED_USERS
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/ALL_AUTHENTICATED_USERS)

(def PRIVATE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/PRIVATE)

(def PROJECT_PRIVATE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/PROJECT_PRIVATE)

(def PUBLIC_READ
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/PUBLIC_READ)

(def PUBLIC_READ_WRITE
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/PUBLIC_READ_WRITE)

(def BUCKET_OWNER_READ
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/BUCKET_OWNER_READ)

(def BUCKET_OWNER_FULL_CONTROL
  "Enum Constant.

  type: com.google.cloud.storage.Storage$PredefinedAcl"
  Storage$PredefinedAcl/BUCKET_OWNER_FULL_CONTROL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Storage.PredefinedAcl c : Storage.PredefinedAcl.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.storage.Storage$PredefinedAcl[]`"
  ([]
    (Storage$PredefinedAcl/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.storage.Storage$PredefinedAcl`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.storage.Storage$PredefinedAcl [^java.lang.String name]
    (Storage$PredefinedAcl/valueOf name)))

