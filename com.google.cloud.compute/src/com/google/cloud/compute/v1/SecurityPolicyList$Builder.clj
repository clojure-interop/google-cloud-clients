(ns com.google.cloud.compute.v1.SecurityPolicyList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SecurityPolicyList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#securityPolicyList for listsof
   securityPolicies

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "A list of SecurityPolicy resources.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#securityPolicyList for listsof
   securityPolicies

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicyList`"
  (^com.google.cloud.compute.v1.SecurityPolicyList [^SecurityPolicyList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyList$Builder this]
    (-> this (.getId))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SecurityPolicyList`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^com.google.cloud.compute.v1.SecurityPolicyList other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "A list of SecurityPolicy resources.

  returns: `java.util.List<com.google.cloud.compute.v1.SecurityPolicy>`"
  (^java.util.List [^SecurityPolicyList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "A list of SecurityPolicy resources.

  items - `com.google.cloud.compute.v1.SecurityPolicy`

  returns: `com.google.cloud.compute.v1.SecurityPolicyList$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyList$Builder [^SecurityPolicyList$Builder this ^com.google.cloud.compute.v1.SecurityPolicy items]
    (-> this (.addItems items))))

