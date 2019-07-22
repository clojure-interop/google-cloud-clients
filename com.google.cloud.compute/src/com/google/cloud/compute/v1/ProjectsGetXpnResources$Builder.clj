(ns com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsGetXpnResources$Builder]))

(defn get-kind
  "[Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   resources (a.k.a service projects)

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsGetXpnResources$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   resources (a.k.a service projects)

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsGetXpnResources$Builder this]
    (-> this (.getNextPageToken))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources [^ProjectsGetXpnResources$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ProjectsGetXpnResources`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this ^com.google.cloud.compute.v1.ProjectsGetXpnResources other]
    (-> this (.mergeFrom other))))

(defn add-resources
  "Service resources (a.k.a service projects) attached to this project as their shared VPC host.

  resources - `com.google.cloud.compute.v1.XpnResourceId`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this ^com.google.cloud.compute.v1.XpnResourceId resources]
    (-> this (.addResources resources))))

(defn get-resources-list
  "Service resources (a.k.a service projects) attached to this project as their shared VPC host.

  returns: `java.util.List<com.google.cloud.compute.v1.XpnResourceId>`"
  (^java.util.List [^ProjectsGetXpnResources$Builder this]
    (-> this (.getResourcesList))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn add-all-resources
  "Service resources (a.k.a service projects) attached to this project as their shared VPC host.

  resources - `java.util.List`

  returns: `com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder`"
  (^com.google.cloud.compute.v1.ProjectsGetXpnResources$Builder [^ProjectsGetXpnResources$Builder this ^java.util.List resources]
    (-> this (.addAllResources resources))))

