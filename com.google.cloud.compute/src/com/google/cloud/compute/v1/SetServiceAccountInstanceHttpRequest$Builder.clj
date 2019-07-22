(ns com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetServiceAccountInstanceHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn set-instances-set-service-account-request-resource
  "instances-set-service-account-request-resource - `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest instances-set-service-account-request-resource]
    (-> this (.setInstancesSetServiceAccountRequestResource instances-set-service-account-request-resource))))

(defn get-instance
  "Name of the instance resource to start. It must have the format
   `{project}/zones/{zone}/instances/{instance}/setServiceAccount`. \\`{instance}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-set-service-account-request-resource
  "returns: `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest`"
  (^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getInstancesSetServiceAccountRequestResource))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn set-request-id
  "An optional request ID to identify requests. Specify a unique request ID so that if you must
   retry your request, the server will know to ignore the request if it has already been
   completed.

   For example, consider a situation where you make an initial request and the request times
   out. If you make the request again with the same request ID, the server can check if original
   operation with the same request ID was received, and if so, will ignore the second request.
   This prevents clients from accidentally creating duplicate commitments.

   The request ID must be a valid UUID with the exception that zero UUID is not supported
   (00000000-0000-0000-0000-000000000000).

  request-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn set-instance
  "Name of the instance resource to start. It must have the format
   `{project}/zones/{zone}/instances/{instance}/setServiceAccount`. \\`{instance}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getPrettyPrint))))

(defn get-request-id
  "An optional request ID to identify requests. Specify a unique request ID so that if you must
   retry your request, the server will know to ignore the request if it has already been
   completed.

   For example, consider a situation where you make an initial request and the request times
   out. If you make the request again with the same request ID, the server can check if original
   operation with the same request ID was received, and if so, will ignore the second request.
   This prevents clients from accidentally creating duplicate commitments.

   The request ID must be a valid UUID with the exception that zero UUID is not supported
   (00000000-0000-0000-0000-000000000000).

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest$Builder [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetServiceAccountInstanceHttpRequest$Builder this]
    (-> this (.getFields))))

