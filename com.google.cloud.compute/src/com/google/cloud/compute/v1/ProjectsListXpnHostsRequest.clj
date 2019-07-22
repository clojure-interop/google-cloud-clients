(ns com.google.cloud.compute.v1.ProjectsListXpnHostsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsListXpnHostsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest`

  returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder [^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest prototype]
    (ProjectsListXpnHostsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder []
    (ProjectsListXpnHostsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest []
    (ProjectsListXpnHostsRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ProjectsListXpnHostsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ProjectsListXpnHostsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ProjectsListXpnHostsRequest this]
    (-> this (.getFieldMask))))

(defn get-organization
  "Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   projects. If not specified, the organization will be inferred from the project.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsListXpnHostsRequest this]
    (-> this (.getOrganization))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder [^ProjectsListXpnHostsRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectsListXpnHostsRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectsListXpnHostsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectsListXpnHostsRequest this]
    (-> this (.hashCode))))

