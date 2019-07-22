(ns com.google.cloud.bigquery.Acl$Group
  "Class for a BigQuery Group entity. Objects of this class represent a group to granted access
  to. A Group entity can be created given the group's email or can be a special group: ofProjectOwners(), ofProjectReaders(), ofProjectWriters() or ofAllAuthenticatedUsers()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$Group]))

(defn ->group
  "Constructor.

  Creates a Group entity given its identifier. Identifier can be either a
   special group identifier or a group email.

  identifier - `java.lang.String`"
  (^Acl$Group [^java.lang.String identifier]
    (new Acl$Group identifier)))

(defn *of-project-owners
  "Returns a Group entity representing all project's owners.

  returns: `com.google.cloud.bigquery.Acl$Group`"
  (^com.google.cloud.bigquery.Acl$Group []
    (Acl$Group/ofProjectOwners )))

(defn *of-project-readers
  "Returns a Group entity representing all project's readers.

  returns: `com.google.cloud.bigquery.Acl$Group`"
  (^com.google.cloud.bigquery.Acl$Group []
    (Acl$Group/ofProjectReaders )))

(defn *of-project-writers
  "Returns a Group entity representing all project's writers.

  returns: `com.google.cloud.bigquery.Acl$Group`"
  (^com.google.cloud.bigquery.Acl$Group []
    (Acl$Group/ofProjectWriters )))

(defn *of-all-authenticated-users
  "Returns a Group entity representing all BigQuery authenticated users.

  returns: `com.google.cloud.bigquery.Acl$Group`"
  (^com.google.cloud.bigquery.Acl$Group []
    (Acl$Group/ofAllAuthenticatedUsers )))

(defn get-identifier
  "Returns group's identifier, can be either a
   special group identifier or a group email.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$Group this]
    (-> this (.getIdentifier))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl$Group this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl$Group this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl$Group this]
    (-> this (.toString))))

