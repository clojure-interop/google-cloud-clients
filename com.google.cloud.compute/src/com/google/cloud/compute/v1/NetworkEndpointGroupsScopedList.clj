(ns com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList prototype]
    (NetworkEndpointGroupsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder []
    (NetworkEndpointGroupsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList []
    (NetworkEndpointGroupsScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that replaces the list of network endpoint groups when
   the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NetworkEndpointGroupsScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroupsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroupsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-network-endpoint-groups-list
  "[Output Only] The list of network endpoint groups that are contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^java.util.List [^NetworkEndpointGroupsScopedList this]
    (-> this (.getNetworkEndpointGroupsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroupsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroupsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList this]
    (-> this (.toBuilder))))

