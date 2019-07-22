(ns com.google.cloud.compute.v1.AddressAggregatedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressAggregatedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AddressAggregatedList`

  returns: `com.google.cloud.compute.v1.AddressAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.AddressAggregatedList$Builder [^com.google.cloud.compute.v1.AddressAggregatedList prototype]
    (AddressAggregatedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AddressAggregatedList$Builder []
    (AddressAggregatedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AddressAggregatedList`"
  (^com.google.cloud.compute.v1.AddressAggregatedList []
    (AddressAggregatedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AddressAggregatedList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#addressAggregatedList for aggregated lists of
   addresses.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressAggregatedList this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AddressAggregatedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressAggregatedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AddressAggregatedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressAggregatedList this]
    (-> this (.getNextPageToken))))

(defn get-items-map
  "A list of AddressesScopedList resources. The key for the map is: [Output Only] Name of the
   scope containing this set of addresses.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.AddressesScopedList>`"
  (^java.util.Map [^AddressAggregatedList this]
    (-> this (.getItemsMap))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressAggregatedList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AddressAggregatedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressAggregatedList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressAggregatedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressAggregatedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AddressAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.AddressAggregatedList$Builder [^AddressAggregatedList this]
    (-> this (.toBuilder))))

