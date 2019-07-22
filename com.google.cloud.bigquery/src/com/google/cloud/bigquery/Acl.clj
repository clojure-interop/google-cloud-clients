(ns com.google.cloud.bigquery.Acl
  "Access Control for a BigQuery Dataset. BigQuery uses ACLs to manage permissions on datasets. ACLs
  are not directly supported on tables. A table inherits its ACL from the dataset that contains it.
  Project roles affect your ability to run jobs or manage the project, while dataset roles affect
  how you can access or modify the data inside of a project."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl]))

(defn *of
  "Returns an Acl object.

  entity - the entity for this ACL object - `com.google.cloud.bigquery.Acl$Entity`
  role - the role to associate to the entity object - `com.google.cloud.bigquery.Acl$Role`

  returns: `com.google.cloud.bigquery.Acl`"
  (^com.google.cloud.bigquery.Acl [^com.google.cloud.bigquery.Acl$Entity entity ^com.google.cloud.bigquery.Acl$Role role]
    (Acl/of entity role))
  (^com.google.cloud.bigquery.Acl [^com.google.cloud.bigquery.Acl$View view]
    (Acl/of view)))

(defn get-entity
  "Returns the entity for this ACL.

  returns: `com.google.cloud.bigquery.Acl$Entity`"
  (^com.google.cloud.bigquery.Acl$Entity [^Acl this]
    (-> this (.getEntity))))

(defn get-role
  "Returns the role specified by this ACL.

  returns: `com.google.cloud.bigquery.Acl$Role`"
  (^com.google.cloud.bigquery.Acl$Role [^Acl this]
    (-> this (.getRole))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl this ^java.lang.Object obj]
    (-> this (.equals obj))))

