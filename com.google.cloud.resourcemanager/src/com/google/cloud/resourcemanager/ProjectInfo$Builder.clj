(ns com.google.cloud.resourcemanager.ProjectInfo$Builder
  "Builder for ProjectInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ProjectInfo$Builder]))

(defn ->builder
  "Constructor."
  (^ProjectInfo$Builder []
    (new ProjectInfo$Builder )))

(defn set-name
  "Set the user-assigned name of the project.

   This field is optional and can remain unset. Allowed characters are: lowercase and
   uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point.
   This field can be changed after project creation.

  name - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-project-id
  "Set the unique, user-assigned ID of the project.

   The ID must be 6 to 30 lowercase letters, digits, or hyphens. It must start with a letter.
   Trailing hyphens are prohibited. This field cannot be changed after the server creates the
   project.

  project-id - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn add-label
  "Add a label associated with this project.

   See ProjectInfo.labels for label restrictions.

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn remove-label
  "Remove a label associated with this project.

  key - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^java.lang.String key]
    (-> this (.removeLabel key))))

(defn clear-labels
  "Clear the labels associated with this project.

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this]
    (-> this (.clearLabels))))

(defn set-labels
  "Set the labels associated with this project.

   Label keys must be between 1 and 63 characters long and must conform to the following
   regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
   characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No
   more than 256 labels can be associated with a given resource. This field can be changed after
   project creation.

  labels - `java.util.Map`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-parent
  "parent - `com.google.cloud.resourcemanager.ProjectInfo$ResourceId`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo$Builder this ^com.google.cloud.resourcemanager.ProjectInfo$ResourceId parent]
    (-> this (.setParent parent))))

(defn build
  "returns: `com.google.cloud.resourcemanager.ProjectInfo`"
  (^com.google.cloud.resourcemanager.ProjectInfo [^ProjectInfo$Builder this]
    (-> this (.build))))

