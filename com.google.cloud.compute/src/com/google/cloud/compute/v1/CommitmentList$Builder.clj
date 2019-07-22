(ns com.google.cloud.compute.v1.CommitmentList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CommitmentList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^CommitmentList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#commitmentList for lists of commitments.

  returns: `java.lang.String`"
  (^java.lang.String [^CommitmentList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "A list of Commitment resources.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#commitmentList for lists of commitments.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^CommitmentList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.CommitmentList`"
  (^com.google.cloud.compute.v1.CommitmentList [^CommitmentList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^CommitmentList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CommitmentList`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^com.google.cloud.compute.v1.CommitmentList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^CommitmentList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "A list of Commitment resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Commitment>`"
  (^java.util.List [^CommitmentList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "A list of Commitment resources.

  items - `com.google.cloud.compute.v1.Commitment`

  returns: `com.google.cloud.compute.v1.CommitmentList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentList$Builder [^CommitmentList$Builder this ^com.google.cloud.compute.v1.Commitment items]
    (-> this (.addItems items))))

