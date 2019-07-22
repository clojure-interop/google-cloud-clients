(ns com.google.cloud.bigquery.Acl$View
  "Class for a BigQuery View entity. Objects of this class represent a view from a different
  dataset to grant access to. Queries executed against that view will have read access to tables
  in this dataset. The role field is not required when this field is set. If that view is updated
  by any user, access to the view needs to be granted again via an update operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$View]))

(defn ->view
  "Constructor.

  Creates a View entity given the view's id.

  id - `com.google.cloud.bigquery.TableId`"
  (^Acl$View [^com.google.cloud.bigquery.TableId id]
    (new Acl$View id)))

(defn get-id
  "Returns table's identity.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^Acl$View this]
    (-> this (.getId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl$View this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl$View this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl$View this]
    (-> this (.toString))))

