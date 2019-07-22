(ns com.google.cloud.compute.v1.VmEndpointNatMappingsList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappingsList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.VmEndpointNatMappingsList`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^com.google.cloud.compute.v1.VmEndpointNatMappingsList prototype]
    (VmEndpointNatMappingsList/newBuilder prototype))
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder []
    (VmEndpointNatMappingsList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList []
    (VmEndpointNatMappingsList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^VmEndpointNatMappingsList this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#vmEndpointNatMappingsList for lists of Nat
   mappings of VM endpoints.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList this]
    (-> this (.getKind))))

(defn get-result-list
  "[Output Only] A list of Nat mapping information of VM endpoints.

  returns: `java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappings>`"
  (^java.util.List [^VmEndpointNatMappingsList this]
    (-> this (.getResultList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VmEndpointNatMappingsList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^VmEndpointNatMappingsList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList this]
    (-> this (.getNextPageToken))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^VmEndpointNatMappingsList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VmEndpointNatMappingsList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VmEndpointNatMappingsList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList this]
    (-> this (.toBuilder))))

