(ns com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ListDiskTypesHttpRequest$Builder]))

(defn get-max-results
  "The maximum number of results per page that should be returned. If the number of available
   results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to
   get the next page of results in subsequent list requests. Acceptable values are 0 to 500,
   inclusive. (Default: 500)

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getMaxResults))))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn build
  "returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.build))))

(defn get-filter
  "A filter expression that filters resources listed in the response. The expression must
   specify the field name, a comparison operator, and the value that you want to use for
   filtering. The value must be a string, a number, or a boolean. The comparison operator must
   be either =, !=, >, or <.

   For example, if you are filtering Compute Engine instances, you can exclude instances
   named example-instance by specifying name != example-instance.

   You can also filter nested fields. For example, you could specify
   scheduling.automaticRestart = false to include instances only if they are not scheduled for
   automatic restarts. You can use filtering on nested fields to filter based on resource
   labels.

   To filter on multiple expressions, provide each separate expression within parentheses.
   For example, (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\"). By
   default, each expression is an AND expression. However, you can include AND and OR
   expressions explicitly. For example, (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel
   Broadwell\") AND (scheduling.automaticRestart = true).

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getFilter))))

(defn set-page-token
  "Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list
   request to get the next page of results.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String page-token]
    (-> this (.setPageToken page-token))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ListDiskTypesHttpRequest`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^com.google.cloud.compute.v1.ListDiskTypesHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "The name of the zone for this request. It must have the format
   `{project}/zones/{zone}/diskTypes`. \\`{zone}\\` must start with a letter, and contain only
   letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`),
   periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be
   between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn get-zone
  "The name of the zone for this request. It must have the format
   `{project}/zones/{zone}/diskTypes`. \\`{zone}\\` must start with a letter, and contain only
   letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`),
   periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be
   between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getZone))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getPrettyPrint))))

(defn set-filter
  "A filter expression that filters resources listed in the response. The expression must
   specify the field name, a comparison operator, and the value that you want to use for
   filtering. The value must be a string, a number, or a boolean. The comparison operator must
   be either =, !=, >, or <.

   For example, if you are filtering Compute Engine instances, you can exclude instances
   named example-instance by specifying name != example-instance.

   You can also filter nested fields. For example, you could specify
   scheduling.automaticRestart = false to include instances only if they are not scheduled for
   automatic restarts. You can use filtering on nested fields to filter based on resource
   labels.

   To filter on multiple expressions, provide each separate expression within parentheses.
   For example, (scheduling.automaticRestart = true) (cpuPlatform = \"Intel Skylake\"). By
   default, each expression is an AND expression. However, you can include AND and OR
   expressions explicitly. For example, (cpuPlatform = \"Intel Skylake\") OR (cpuPlatform = \"Intel
   Broadwell\") AND (scheduling.automaticRestart = true).

  filter - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getFields))))

(defn set-order-by
  "Sorts list results by a certain order. By default, results are returned in alphanumerical
   order based on the resource name.

   You can also sort results in descending order based on the creation timestamp using
   orderBy=\"creationTimestamp desc\". This sorts results based on the creationTimestamp field in
   reverse chronological order (newest result first). Use this to sort resources like operations
   so that the newest operation is returned first.

   Currently, only sorting by name or creationTimestamp desc is supported.

  order-by - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.String order-by]
    (-> this (.setOrderBy order-by))))

(defn get-page-token
  "Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list
   request to get the next page of results.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getPageToken))))

(defn set-max-results
  "The maximum number of results per page that should be returned. If the number of available
   results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to
   get the next page of results in subsequent list requests. Acceptable values are 0 to 500,
   inclusive. (Default: 500)

  max-results - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ListDiskTypesHttpRequest$Builder [^ListDiskTypesHttpRequest$Builder this ^java.lang.Integer max-results]
    (-> this (.setMaxResults max-results))))

(defn get-order-by
  "Sorts list results by a certain order. By default, results are returned in alphanumerical
   order based on the resource name.

   You can also sort results in descending order based on the creation timestamp using
   orderBy=\"creationTimestamp desc\". This sorts results based on the creationTimestamp field in
   reverse chronological order (newest result first). Use this to sort resources like operations
   so that the newest operation is returned first.

   Currently, only sorting by name or creationTimestamp desc is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^ListDiskTypesHttpRequest$Builder this]
    (-> this (.getOrderBy))))

