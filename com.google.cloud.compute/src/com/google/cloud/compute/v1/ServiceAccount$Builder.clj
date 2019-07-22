(ns com.google.cloud.compute.v1.ServiceAccount$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ServiceAccount$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ServiceAccount`

  returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount$Builder this ^com.google.cloud.compute.v1.ServiceAccount other]
    (-> this (.mergeFrom other))))

(defn get-email
  "Email address of the service account.

  returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount$Builder this]
    (-> this (.getEmail))))

(defn set-email
  "Email address of the service account.

  email - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount$Builder this ^java.lang.String email]
    (-> this (.setEmail email))))

(defn get-scopes-list
  "The list of scopes to be made available for this service account.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ServiceAccount$Builder this]
    (-> this (.getScopesList))))

(defn add-all-scopes
  "The list of scopes to be made available for this service account.

  scopes - `java.util.List`

  returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount$Builder this ^java.util.List scopes]
    (-> this (.addAllScopes scopes))))

(defn add-scopes
  "The list of scopes to be made available for this service account.

  scopes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount$Builder this ^java.lang.String scopes]
    (-> this (.addScopes scopes))))

(defn build
  "returns: `com.google.cloud.compute.v1.ServiceAccount`"
  (^com.google.cloud.compute.v1.ServiceAccount [^ServiceAccount$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount$Builder this]
    (-> this (.clone))))

