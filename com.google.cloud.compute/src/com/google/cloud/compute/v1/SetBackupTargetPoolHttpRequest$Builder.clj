(ns com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetBackupTargetPoolHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn get-target-pool
  "Name of the TargetPool resource to set a backup pool for. It must have the format
   `{project}/regions/{region}/targetPools/{targetPool}/setBackup`. \\`{targetPool}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getTargetPool))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getKey))))

(defn get-target-reference-resource
  "returns: `com.google.cloud.compute.v1.TargetReference`"
  (^com.google.cloud.compute.v1.TargetReference [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getTargetReferenceResource))))

(defn set-failover-ratio
  "New failoverRatio value for the target pool.

  failover-ratio - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.Float failover-ratio]
    (-> this (.setFailoverRatio failover-ratio))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn set-target-reference-resource
  "target-reference-resource - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^com.google.cloud.compute.v1.TargetReference target-reference-resource]
    (-> this (.setTargetReferenceResource target-reference-resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-failover-ratio
  "New failoverRatio value for the target pool.

  returns: `java.lang.Float`"
  (^java.lang.Float [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getFailoverRatio))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
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
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetBackupTargetPoolHttpRequest$Builder this]
    (-> this (.getFields))))

(defn set-target-pool
  "Name of the TargetPool resource to set a backup pool for. It must have the format
   `{project}/regions/{region}/targetPools/{targetPool}/setBackup`. \\`{targetPool}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  target-pool - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest$Builder [^SetBackupTargetPoolHttpRequest$Builder this ^java.lang.String target-pool]
    (-> this (.setTargetPool target-pool))))

