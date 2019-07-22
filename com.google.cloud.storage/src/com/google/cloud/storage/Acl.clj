(ns com.google.cloud.storage.Acl
  "Access Control List for buckets or blobs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Acl]))

(defn *of
  "Returns an Acl object.

  entity - the entity for this ACL object - `com.google.cloud.storage.Acl$Entity`
  role - the role to associate to the entity object - `com.google.cloud.storage.Acl$Role`

  returns: `com.google.cloud.storage.Acl`"
  (^com.google.cloud.storage.Acl [^com.google.cloud.storage.Acl$Entity entity ^com.google.cloud.storage.Acl$Role role]
    (Acl/of entity role)))

(defn *new-builder
  "Returns a builder for Acl objects.

  entity - the entity for this ACL object - `com.google.cloud.storage.Acl$Entity`
  role - the role to associate to the entity object - `com.google.cloud.storage.Acl$Role`

  returns: `com.google.cloud.storage.Acl$Builder`"
  (^com.google.cloud.storage.Acl$Builder [^com.google.cloud.storage.Acl$Entity entity ^com.google.cloud.storage.Acl$Role role]
    (Acl/newBuilder entity role)))

(defn get-entity
  "Returns the entity for this ACL object.

  returns: `com.google.cloud.storage.Acl$Entity`"
  (^com.google.cloud.storage.Acl$Entity [^Acl this]
    (-> this (.getEntity))))

(defn get-role
  "Returns the role associated to the entity in this ACL object.

  returns: `com.google.cloud.storage.Acl$Role`"
  (^com.google.cloud.storage.Acl$Role [^Acl this]
    (-> this (.getRole))))

(defn get-id
  "Returns the ID of the ACL entry.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl this]
    (-> this (.getId))))

(defn get-etag
  "Returns HTTP 1.1 Entity tag for the ACL entry.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl this]
    (-> this (.getEtag))))

(defn to-builder
  "Returns a builder for this Acl object.

  returns: `com.google.cloud.storage.Acl$Builder`"
  (^com.google.cloud.storage.Acl$Builder [^Acl this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl this ^java.lang.Object obj]
    (-> this (.equals obj))))

