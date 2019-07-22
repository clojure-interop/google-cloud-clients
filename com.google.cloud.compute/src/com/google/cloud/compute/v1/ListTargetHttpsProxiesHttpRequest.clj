(ns com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ListTargetHttpsProxiesHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest`

  returns: `com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest$Builder [^com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest prototype]
    (ListTargetHttpsProxiesHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest$Builder []
    (ListTargetHttpsProxiesHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest`"
  (^com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest []
    (ListTargetHttpsProxiesHttpRequest/getDefaultInstance )))

(defn get-max-results
  "The maximum number of results per page that should be returned. If the number of available
   results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to
   get the next page of results in subsequent list requests. Acceptable values are 0 to 500,
   inclusive. (Default: 500)

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getMaxResults))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getUserIp))))

(defn get-project
  "Project ID for this request. It must have the format `{project}/global/targetHttpsProxies`.
   \\`{project}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers
   (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus
   (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters in length, and
   it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getProject))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ListTargetHttpsProxiesHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-filter
  "A filter expression that filters resources listed in the response. The expression must specify
   the field name, a comparison operator, and the value that you want to use for filtering. The
   value must be a string, a number, or a boolean. The comparison operator must be either =, !=,
   >, or <.

   For example, if you are filtering Compute Engine instances, you can exclude instances named
   example-instance by specifying name != example-instance.

   You can also filter nested fields. For example, you could specify
   scheduling.automaticRestart = false to include instances only if they are not scheduled for
   automatic restarts. You can use filtering on nested fields to filter based on resource labels.

   To filter on multiple expressions, provide each separate expression within parentheses. For
   example, (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\"). By default, each
   expression is an AND expression. However, you can include AND and OR expressions explicitly.
   For example, (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel Broadwell\") AND
   (scheduling.automaticRestart = true).

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getFilter))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getFields))))

(defn get-page-token
  "Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list
   request to get the next page of results.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getPageToken))))

(defn get-order-by
  "Sorts list results by a certain order. By default, results are returned in alphanumerical order
   based on the resource name.

   You can also sort results in descending order based on the creation timestamp using
   orderBy=\"creationTimestamp desc\". This sorts results based on the creationTimestamp field in
   reverse chronological order (newest result first). Use this to sort resources like operations
   so that the newest operation is returned first.

   Currently, only sorting by name or creationTimestamp desc is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.getOrderBy))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ListTargetHttpsProxiesHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest$Builder [^ListTargetHttpsProxiesHttpRequest this]
    (-> this (.toBuilder))))

