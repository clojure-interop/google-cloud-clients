(ns com.google.cloud.storage.Acl$Builder
  "Builder for Acl objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl$Builder]))

(defn set-entity
  "Sets the entity for the ACL object.

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: `com.google.cloud.storage.Acl$Builder`"
  (^com.google.cloud.storage.Acl$Builder [^Acl$Builder this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.setEntity entity))))

(defn set-role
  "Sets the role to associate to the entity object.

  role - `com.google.cloud.storage.Acl$Role`

  returns: `com.google.cloud.storage.Acl$Builder`"
  (^com.google.cloud.storage.Acl$Builder [^Acl$Builder this ^com.google.cloud.storage.Acl$Role role]
    (-> this (.setRole role))))

(defn build
  "Creates an Acl object from this builder.

  returns: `com.google.cloud.storage.Acl`"
  (^com.google.cloud.storage.Acl [^Acl$Builder this]
    (-> this (.build))))

