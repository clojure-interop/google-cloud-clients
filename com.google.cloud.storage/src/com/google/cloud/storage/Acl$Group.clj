(ns com.google.cloud.storage.Acl$Group
  "Class for ACL Group entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Group]))

(defn ->group
  "Constructor.

  Creates a group entity.

  email - the group email - `java.lang.String`"
  (^Acl$Group [^java.lang.String email]
    (new Acl$Group email)))

(defn get-email
  "Returns the group email.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$Group this]
    (-> this (.getEmail))))

