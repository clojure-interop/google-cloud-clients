(ns com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetSslPolicyHttpRequest$Builder]))

(defn set-ssl-policy
  "Name of the SSL policy to update. The name must be 1-63 characters long, and comply with
   RFC1035. It must have the format `{project}/global/sslPolicies/{sslPolicy}`. \\`{sslPolicy}\\`
   must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`),
   dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or
   percent * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it *
   must not start with \\`\"goog\"\\`.

  ssl-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String ssl-policy]
    (-> this (.setSslPolicy ssl-policy))))

(defn get-ssl-policy
  "Name of the SSL policy to update. The name must be 1-63 characters long, and comply with
   RFC1035. It must have the format `{project}/global/sslPolicies/{sslPolicy}`. \\`{sslPolicy}\\`
   must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`),
   dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or
   percent * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it *
   must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getSslPolicy))))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn build
  "returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.GetSslPolicyHttpRequest`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^com.google.cloud.compute.v1.GetSslPolicyHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getPrettyPrint))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetSslPolicyHttpRequest$Builder [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetSslPolicyHttpRequest$Builder this]
    (-> this (.getFields))))

