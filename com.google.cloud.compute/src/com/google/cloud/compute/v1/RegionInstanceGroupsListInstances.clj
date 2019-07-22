(ns com.google.cloud.compute.v1.RegionInstanceGroupsListInstances
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupsListInstances]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupsListInstances`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstances$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstances$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupsListInstances prototype]
    (RegionInstanceGroupsListInstances/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstances$Builder []
    (RegionInstanceGroupsListInstances/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstances`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstances []
    (RegionInstanceGroupsListInstances/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^RegionInstanceGroupsListInstances this]
    (-> this (.getWarning))))

(defn get-kind
  "The resource type.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstances this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupsListInstances this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstances this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupsListInstances this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstances this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstances this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupsListInstances this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstances this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupsListInstances this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of InstanceWithNamedPorts resources.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceWithNamedPorts>`"
  (^java.util.List [^RegionInstanceGroupsListInstances this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupsListInstances this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstances$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstances$Builder [^RegionInstanceGroupsListInstances this]
    (-> this (.toBuilder))))

