(ns com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsListXpnHostsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest`

  returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder [^ProjectsListXpnHostsRequest$Builder this ^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest other]
    (-> this (.mergeFrom other))))

(defn get-organization
  "Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   projects. If not specified, the organization will be inferred from the project.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsListXpnHostsRequest$Builder this]
    (-> this (.getOrganization))))

(defn set-organization
  "Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   projects. If not specified, the organization will be inferred from the project.

  organization - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder [^ProjectsListXpnHostsRequest$Builder this ^java.lang.String organization]
    (-> this (.setOrganization organization))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest [^ProjectsListXpnHostsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest$Builder [^ProjectsListXpnHostsRequest$Builder this]
    (-> this (.clone))))

