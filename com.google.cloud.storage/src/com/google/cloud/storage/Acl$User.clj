(ns com.google.cloud.storage.Acl$User
  "Class for ACL User entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$User]))

(defn ->user
  "Constructor.

  Creates a user entity.

  email - the user email - `java.lang.String`"
  (^Acl$User [^java.lang.String email]
    (new Acl$User email)))

(defn *of-all-users
  "returns: `com.google.cloud.storage.Acl$User`"
  (^com.google.cloud.storage.Acl$User []
    (Acl$User/ofAllUsers )))

(defn *of-all-authenticated-users
  "returns: `com.google.cloud.storage.Acl$User`"
  (^com.google.cloud.storage.Acl$User []
    (Acl$User/ofAllAuthenticatedUsers )))

(defn get-email
  "Returns the user email.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$User this]
    (-> this (.getEmail))))

