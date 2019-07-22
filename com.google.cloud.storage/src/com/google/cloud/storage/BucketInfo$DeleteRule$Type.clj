(ns com.google.cloud.storage.BucketInfo$DeleteRule$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$DeleteRule$Type]))

(def AGE
  "Enum Constant.

  type: com.google.cloud.storage.BucketInfo$DeleteRule$Type"
  BucketInfo$DeleteRule$Type/AGE)

(def CREATE_BEFORE
  "Enum Constant.

  type: com.google.cloud.storage.BucketInfo$DeleteRule$Type"
  BucketInfo$DeleteRule$Type/CREATE_BEFORE)

(def NUM_NEWER_VERSIONS
  "Enum Constant.

  type: com.google.cloud.storage.BucketInfo$DeleteRule$Type"
  BucketInfo$DeleteRule$Type/NUM_NEWER_VERSIONS)

(def IS_LIVE
  "Enum Constant.

  type: com.google.cloud.storage.BucketInfo$DeleteRule$Type"
  BucketInfo$DeleteRule$Type/IS_LIVE)

(def UNKNOWN
  "Enum Constant.

  type: com.google.cloud.storage.BucketInfo$DeleteRule$Type"
  BucketInfo$DeleteRule$Type/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BucketInfo.DeleteRule.Type c : BucketInfo.DeleteRule.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.storage.BucketInfo$DeleteRule$Type[]`"
  ([]
    (BucketInfo$DeleteRule$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.storage.BucketInfo$DeleteRule$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.storage.BucketInfo$DeleteRule$Type [^java.lang.String name]
    (BucketInfo$DeleteRule$Type/valueOf name)))

