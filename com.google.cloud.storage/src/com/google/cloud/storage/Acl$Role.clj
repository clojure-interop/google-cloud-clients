(ns com.google.cloud.storage.Acl$Role
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Role]))

(def *-owner
  "Static Constant.

  type: com.google.cloud.storage.Acl$Role"
  Acl$Role/OWNER)

(def *-reader
  "Static Constant.

  type: com.google.cloud.storage.Acl$Role"
  Acl$Role/READER)

(def *-writer
  "Static Constant.

  type: com.google.cloud.storage.Acl$Role"
  Acl$Role/WRITER)

(defn *value-of-strict
  "Get the Role for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.Acl$Role`"
  (^com.google.cloud.storage.Acl$Role [^java.lang.String constant]
    (Acl$Role/valueOfStrict constant)))

(defn *value-of
  "Get the Role for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.Acl$Role`"
  (^com.google.cloud.storage.Acl$Role [^java.lang.String constant]
    (Acl$Role/valueOf constant)))

(defn *values
  "Return the known values for Role.

  returns: `com.google.cloud.storage.Acl$Role[]`"
  ([]
    (Acl$Role/values )))

