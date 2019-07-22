(ns com.google.cloud.storage.ServiceAccount
  "A service account, with its specified scopes, authorized for this instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage ServiceAccount]))

(defn *of
  "Returns a ServiceAccount object for the provided email.

  email - `java.lang.String`

  returns: `com.google.cloud.storage.ServiceAccount`"
  (^com.google.cloud.storage.ServiceAccount [^java.lang.String email]
    (ServiceAccount/of email)))

(defn get-email
  "Returns the email address of the service account.

  returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount this]
    (-> this (.getEmail))))

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

