(ns com.google.cloud.storage.Acl$Domain
  "Class for ACL Domain entities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Domain]))

(defn ->domain
  "Constructor.

  Creates a domain entity.

  domain - the domain associated to this entity - `java.lang.String`"
  (^Acl$Domain [^java.lang.String domain]
    (new Acl$Domain domain)))

(defn get-domain
  "Returns the domain associated to this entity.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$Domain this]
    (-> this (.getDomain))))

