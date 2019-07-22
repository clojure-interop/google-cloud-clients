(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder
  "Builder for ErrorStatsServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorStatsServiceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder [^ErrorStatsServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ErrorStatsServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-group-stats-settings
  "Returns the builder for the settings used for calls to listGroupStats.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ErrorStatsServiceStubSettings$Builder this]
    (-> this (.listGroupStatsSettings))))

(defn list-events-settings
  "Returns the builder for the settings used for calls to listEvents.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ErrorStatsServiceStubSettings$Builder this]
    (-> this (.listEventsSettings))))

(defn delete-events-settings
  "Returns the builder for the settings used for calls to deleteEvents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ErrorStatsServiceStubSettings$Builder this]
    (-> this (.deleteEventsSettings))))

(defn build
  "returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings [^ErrorStatsServiceStubSettings$Builder this]
    (-> this (.build))))

