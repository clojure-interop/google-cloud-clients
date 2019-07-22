(ns com.google.cloud.compute.v1.ProjectsGetXpnResources
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsGetXpnResources]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ProjectsGetXpnResources`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^com.google.cloud.compute.v1.ProjectsGetXpnResources prototype]
    (ProjectsGetXpnResources/newBuilder prototype))
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder []
    (ProjectsGetXpnResources/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources []
    (ProjectsGetXpnResources/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   resources (a.k.a service projects)

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsGetXpnResources this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ProjectsGetXpnResources this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectsGetXpnResources this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ProjectsGetXpnResources this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsGetXpnResources this]
    (-> this (.getNextPageToken))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ProjectsGetXpnResources this]
    (-> this (.getApiMessageRequestBody))))

(defn get-resources-list
  "Service resources (a.k.a service projects) attached to this project as their shared VPC host.

  returns: `java.util.List<com.google.cloud.compute.v1.XpnResourceId>`"
  (^java.util.List [^ProjectsGetXpnResources this]
    (-> this (.getResourcesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectsGetXpnResources this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectsGetXpnResources this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources this]
    (-> this (.toBuilder))))

