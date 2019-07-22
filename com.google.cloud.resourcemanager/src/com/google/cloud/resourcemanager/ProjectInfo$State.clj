(ns com.google.cloud.resourcemanager.ProjectInfo$State
  "The project lifecycle states."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ProjectInfo$State]))

(def *-lifecycle-state-unspecified
  "Static Constant.

  Only used/useful for distinguishing unset values.

  type: com.google.cloud.resourcemanager.ProjectInfo$State"
  ProjectInfo$State/LIFECYCLE_STATE_UNSPECIFIED)

(def *-active
  "Static Constant.

  The normal and active state.

  type: com.google.cloud.resourcemanager.ProjectInfo$State"
  ProjectInfo$State/ACTIVE)

(def *-delete-requested
  "Static Constant.

  The project has been marked for deletion by the user or by the system (Google Cloud
   Platform). This can generally be reversed by calling ResourceManager.undelete(java.lang.String).

  type: com.google.cloud.resourcemanager.ProjectInfo$State"
  ProjectInfo$State/DELETE_REQUESTED)

(def *-delete-in-progress
  "Static Constant.

  The process of deleting the project has begun. Reversing the deletion is no longer possible.

  type: com.google.cloud.resourcemanager.ProjectInfo$State"
  ProjectInfo$State/DELETE_IN_PROGRESS)

(defn *value-of-strict
  "Get the State for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$State`"
  (^com.google.cloud.resourcemanager.ProjectInfo$State [^java.lang.String constant]
    (ProjectInfo$State/valueOfStrict constant)))

(defn *value-of
  "Get the State for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$State`"
  (^com.google.cloud.resourcemanager.ProjectInfo$State [^java.lang.String constant]
    (ProjectInfo$State/valueOf constant)))

(defn *values
  "Return the known values for State.

  returns: `com.google.cloud.resourcemanager.ProjectInfo$State[]`"
  ([]
    (ProjectInfo$State/values )))

