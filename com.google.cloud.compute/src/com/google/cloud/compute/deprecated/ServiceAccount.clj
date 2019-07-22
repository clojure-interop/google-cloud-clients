(ns com.google.cloud.compute.deprecated.ServiceAccount
  "A service account, with its specified scopes, authorized for this instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ServiceAccount]))

(defn *of
  "Returns a ServiceAccount object for the provided email and scopes.

  email - `java.lang.String`
  scopes - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.ServiceAccount`"
  (^com.google.cloud.compute.deprecated.ServiceAccount [^java.lang.String email ^java.util.List scopes]
    (ServiceAccount/of email scopes)))

(defn get-email
  "Returns the email address of the service account.

  returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount this]
    (-> this (.getEmail))))

(defn get-scopes
  "Returns the list of scopes to be made available for this service account.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ServiceAccount this]
    (-> this (.getScopes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ServiceAccount this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ServiceAccount this ^java.lang.Object obj]
    (-> this (.equals obj))))

