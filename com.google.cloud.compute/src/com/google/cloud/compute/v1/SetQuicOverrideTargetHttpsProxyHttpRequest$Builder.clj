(ns com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetQuicOverrideTargetHttpsProxyHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-target-https-proxy
  "Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should
   conform to RFC1035. It must have the format
   `{project}/global/targetHttpsProxies/{targetHttpsProxy}/setQuicOverride`.
   \\`{targetHttpsProxy}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`),
   numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes
   (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters
   in length, and it * must not start with \\`\"goog\"\\`.

  target-https-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String target-https-proxy]
    (-> this (.setTargetHttpsProxy target-https-proxy))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn get-target-https-proxy
  "Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should
   conform to RFC1035. It must have the format
   `{project}/global/targetHttpsProxies/{targetHttpsProxy}/setQuicOverride`.
   \\`{targetHttpsProxy}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`),
   numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes
   (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters
   in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getTargetHttpsProxy))))

(defn get-target-https-proxies-set-quic-override-request-resource
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getTargetHttpsProxiesSetQuicOverrideRequestResource))))

(defn build
  "returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.build))))

(defn set-target-https-proxies-set-quic-override-request-resource
  "target-https-proxies-set-quic-override-request-resource - `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest target-https-proxies-set-quic-override-request-resource]
    (-> this (.setTargetHttpsProxiesSetQuicOverrideRequestResource target-https-proxies-set-quic-override-request-resource))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
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
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest$Builder [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetQuicOverrideTargetHttpsProxyHttpRequest$Builder this]
    (-> this (.getFields))))
