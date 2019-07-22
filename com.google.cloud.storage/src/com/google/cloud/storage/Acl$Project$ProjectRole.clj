(ns com.google.cloud.storage.Acl$Project$ProjectRole
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Project$ProjectRole]))

(def *-owners
  "Static Constant.

  type: com.google.cloud.storage.Acl$Project$ProjectRole"
  Acl$Project$ProjectRole/OWNERS)

(def *-editors
  "Static Constant.

  type: com.google.cloud.storage.Acl$Project$ProjectRole"
  Acl$Project$ProjectRole/EDITORS)

(def *-viewers
  "Static Constant.

  type: com.google.cloud.storage.Acl$Project$ProjectRole"
  Acl$Project$ProjectRole/VIEWERS)

(defn *value-of-strict
  "Get the ProjectRole for the given String constant, and throw an exception if the constant
   is not recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.Acl$Project$ProjectRole`"
  (^com.google.cloud.storage.Acl$Project$ProjectRole [^java.lang.String constant]
    (Acl$Project$ProjectRole/valueOfStrict constant)))

(defn *value-of
  "Get the ProjectRole for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.storage.Acl$Project$ProjectRole`"
  (^com.google.cloud.storage.Acl$Project$ProjectRole [^java.lang.String constant]
    (Acl$Project$ProjectRole/valueOf constant)))

(defn *values
  "Return the known values for ProjectRole.

  returns: `com.google.cloud.storage.Acl$Project$ProjectRole[]`"
  ([]
    (Acl$Project$ProjectRole/values )))

