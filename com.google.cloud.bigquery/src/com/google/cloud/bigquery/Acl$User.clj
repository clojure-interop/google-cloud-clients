(ns com.google.cloud.bigquery.Acl$User
  "Class for a BigQuery User entity. Objects of this class represent a user to grant access to
  given the email address."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$User]))

(defn ->user
  "Constructor.

  Creates a User entity given the user's email.

  email - `java.lang.String`"
  (^Acl$User [^java.lang.String email]
    (new Acl$User email)))

(defn get-email
  "Returns user's email.

  returns: `java.lang.String`"
  (^java.lang.String [^Acl$User this]
    (-> this (.getEmail))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Acl$User this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Acl$User this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Acl$User this]
    (-> this (.toString))))

