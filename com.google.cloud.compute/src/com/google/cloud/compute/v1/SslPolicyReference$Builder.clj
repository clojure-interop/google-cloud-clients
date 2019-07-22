(ns com.google.cloud.compute.v1.SslPolicyReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicyReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SslPolicyReference`

  returns: `com.google.cloud.compute.v1.SslPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder [^SslPolicyReference$Builder this ^com.google.cloud.compute.v1.SslPolicyReference other]
    (-> this (.mergeFrom other))))

(defn get-ssl-policy
  "URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy
   associated with the target proxy resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicyReference$Builder this]
    (-> this (.getSslPolicy))))

(defn set-ssl-policy
  "URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy
   associated with the target proxy resource.

  ssl-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder [^SslPolicyReference$Builder this ^java.lang.String ssl-policy]
    (-> this (.setSslPolicy ssl-policy))))

(defn build
  "returns: `com.google.cloud.compute.v1.SslPolicyReference`"
  (^com.google.cloud.compute.v1.SslPolicyReference [^SslPolicyReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SslPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder [^SslPolicyReference$Builder this]
    (-> this (.clone))))

