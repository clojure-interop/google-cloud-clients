(ns com.google.cloud.compute.v1.InstanceGroupsListInstances
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsListInstances]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsListInstances`

  returns: `com.google.cloud.compute.v1.InstanceGroupsListInstances$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstances$Builder [^com.google.cloud.compute.v1.InstanceGroupsListInstances prototype]
    (InstanceGroupsListInstances/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsListInstances$Builder []
    (InstanceGroupsListInstances/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstances`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstances []
    (InstanceGroupsListInstances/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupsListInstances this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceGroupsListInstances for the
   list of instances in the specified instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstances this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsListInstances this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstances this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsListInstances this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstances this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstances this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsListInstances this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstances this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsListInstances this]
    (-> this (.hashCode))))

(defn get-items-list
  "A list of InstanceWithNamedPorts resources.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceWithNamedPorts>`"
  (^java.util.List [^InstanceGroupsListInstances this]
    (-> this (.getItemsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsListInstances this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstances$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstances$Builder [^InstanceGroupsListInstances this]
    (-> this (.toBuilder))))

