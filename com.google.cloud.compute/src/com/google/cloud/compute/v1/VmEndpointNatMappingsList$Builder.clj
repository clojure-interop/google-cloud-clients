(ns com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappingsList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#vmEndpointNatMappingsList for lists of Nat
   mappings of VM endpoints.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getKind))))

(defn get-result-list
  "[Output Only] A list of Nat mapping information of VM endpoints.

  returns: `java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappings>`"
  (^java.util.List [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getResultList))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#vmEndpointNatMappingsList for lists of Nat
   mappings of VM endpoints.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList [^VmEndpointNatMappingsList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.VmEndpointNatMappingsList`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^com.google.cloud.compute.v1.VmEndpointNatMappingsList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this]
    (-> this (.clone))))

(defn add-all-result
  "[Output Only] A list of Nat mapping information of VM endpoints.

  result - `java.util.List`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^java.util.List result]
    (-> this (.addAllResult result))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn add-result
  "[Output Only] A list of Nat mapping information of VM endpoints.

  result - `com.google.cloud.compute.v1.VmEndpointNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsList$Builder [^VmEndpointNatMappingsList$Builder this ^com.google.cloud.compute.v1.VmEndpointNatMappings result]
    (-> this (.addResult result))))

