(ns com.google.cloud.monitoring.v3.UptimeCheckServiceClient
  "Service Description: The UptimeCheckService API is used to manage (list, create, delete, edit)
  uptime check configurations in the Stackdriver Monitoring product. An uptime check is a piece of
  configuration that determines which resources and services to monitor for availability. These
  configurations can also be configured interactively by navigating to the [Cloud Console]
  (http://console.cloud.google.com), selecting the appropriate project, clicking on \"Monitoring\" on
  the left-hand side to navigate to Stackdriver, and then clicking on \"Uptime\".

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
    UptimeCheckConfigName name = UptimeCheckConfigName.of(\"[PROJECT]\", \"[UPTIME_CHECK_CONFIG]\");
    UptimeCheckConfig response = uptimeCheckServiceClient.getUptimeCheckConfig(name);
  }

  Note: close() needs to be called on the uptimeCheckServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of UptimeCheckServiceSettings to
  create(). For example:

  To customize credentials:



  UptimeCheckServiceSettings uptimeCheckServiceSettings =
      UptimeCheckServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  UptimeCheckServiceClient uptimeCheckServiceClient =
      UptimeCheckServiceClient.create(uptimeCheckServiceSettings);

  To customize the endpoint:



  UptimeCheckServiceSettings uptimeCheckServiceSettings =
      UptimeCheckServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  UptimeCheckServiceClient uptimeCheckServiceClient =
      UptimeCheckServiceClient.create(uptimeCheckServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 UptimeCheckServiceClient]))

(defn *create
  "Constructs an instance of UptimeCheckServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.monitoring.v3.UptimeCheckServiceSettings`

  returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceClient [^com.google.cloud.monitoring.v3.UptimeCheckServiceSettings settings]
    (UptimeCheckServiceClient/create settings))
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceClient []
    (UptimeCheckServiceClient/create )))

(defn list-uptime-check-ips-callable
  "Returns the list of IPs that checkers run from

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
     while (true) {
       ListUptimeCheckIpsResponse response = uptimeCheckServiceClient.listUptimeCheckIpsCallable().call(request);
       for (UptimeCheckIp element : response.getUptimeCheckIpsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.monitoring.v3.ListUptimeCheckIpsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.listUptimeCheckIpsCallable))))

(defn list-uptime-check-ips-paged-callable
  "Returns the list of IPs that checkers run from

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
     ApiFuture<ListUptimeCheckIpsPagedResponse> future = uptimeCheckServiceClient.listUptimeCheckIpsPagedCallable().futureCall(request);
     // Do something
     for (UptimeCheckIp element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.listUptimeCheckIpsPagedCallable))))

(defn create-uptime-check-config
  "Creates a new uptime check configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     String formattedParent = ProjectName.format(\"[PROJECT]\");
     UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
     UptimeCheckConfig response = uptimeCheckServiceClient.createUptimeCheckConfig(formattedParent, uptimeCheckConfig);
   }

  parent - The project in which to create the uptime check. The format is `projects/[PROJECT_ID]`. - `java.lang.String`
  uptime-check-config - The new uptime check configuration. - `com.google.monitoring.v3.UptimeCheckConfig`

  returns: `com.google.monitoring.v3.UptimeCheckConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.UptimeCheckConfig [^UptimeCheckServiceClient this ^java.lang.String parent ^com.google.monitoring.v3.UptimeCheckConfig uptime-check-config]
    (-> this (.createUptimeCheckConfig parent uptime-check-config)))
  (^com.google.monitoring.v3.UptimeCheckConfig [^UptimeCheckServiceClient this ^com.google.monitoring.v3.CreateUptimeCheckConfigRequest request]
    (-> this (.createUptimeCheckConfig request))))

(defn list-uptime-check-configs-callable
  "Lists the existing valid uptime check configurations for the project, leaving out any invalid
   configurations.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     String formattedParent = ProjectName.format(\"[PROJECT]\");
     ListUptimeCheckConfigsRequest request = ListUptimeCheckConfigsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListUptimeCheckConfigsResponse response = uptimeCheckServiceClient.listUptimeCheckConfigsCallable().call(request);
       for (UptimeCheckConfig element : response.getUptimeCheckConfigsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.monitoring.v3.ListUptimeCheckConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.listUptimeCheckConfigsCallable))))

(defn list-uptime-check-ips
  "Returns the list of IPs that checkers run from

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
     for (UptimeCheckIp element : uptimeCheckServiceClient.listUptimeCheckIps(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.monitoring.v3.ListUptimeCheckIpsRequest`

  returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse [^UptimeCheckServiceClient this ^com.google.monitoring.v3.ListUptimeCheckIpsRequest request]
    (-> this (.listUptimeCheckIps request))))

(defn get-settings
  "returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceSettings`"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceSettings [^UptimeCheckServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStub`"
  ([^UptimeCheckServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^UptimeCheckServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^UptimeCheckServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^UptimeCheckServiceClient this]
    (-> this (.shutdown))))

(defn get-uptime-check-config-callable
  "Gets a single uptime check configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfigName name = UptimeCheckConfigName.of(\"[PROJECT]\", \"[UPTIME_CHECK_CONFIG]\");
     GetUptimeCheckConfigRequest request = GetUptimeCheckConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<UptimeCheckConfig> future = uptimeCheckServiceClient.getUptimeCheckConfigCallable().futureCall(request);
     // Do something
     UptimeCheckConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.getUptimeCheckConfigCallable))))

(defn create-uptime-check-config-callable
  "Creates a new uptime check configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     String formattedParent = ProjectName.format(\"[PROJECT]\");
     UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
     CreateUptimeCheckConfigRequest request = CreateUptimeCheckConfigRequest.newBuilder()
       .setParent(formattedParent)
       .setUptimeCheckConfig(uptimeCheckConfig)
       .build();
     ApiFuture<UptimeCheckConfig> future = uptimeCheckServiceClient.createUptimeCheckConfigCallable().futureCall(request);
     // Do something
     UptimeCheckConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.createUptimeCheckConfigCallable))))

(defn update-uptime-check-config
  "Updates an uptime check configuration. You can either replace the entire configuration with a
   new one or replace only certain fields in the current configuration by specifying the fields to
   be updated via `\"updateMask\"`. Returns the updated configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
     UptimeCheckConfig response = uptimeCheckServiceClient.updateUptimeCheckConfig(uptimeCheckConfig);
   }

  uptime-check-config - Required. If an `\"updateMask\"` has been specified, this field gives the values for the set of fields mentioned in the `\"updateMask\"`. If an `\"updateMask\"` has not been given, this uptime check configuration replaces the current configuration. If a field is mentioned in `\"updateMask\"` but the corresonding field is omitted in this partial uptime check configuration, it has the effect of deleting/clearing the field from the configuration on the server. The following fields can be updated: `display_name`, `http_check`, `tcp_check`, `timeout`, `content_matchers`, and `selected_regions`. - `com.google.monitoring.v3.UptimeCheckConfig`

  returns: `com.google.monitoring.v3.UptimeCheckConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.UptimeCheckConfig [^UptimeCheckServiceClient this ^com.google.monitoring.v3.UptimeCheckConfig uptime-check-config]
    (-> this (.updateUptimeCheckConfig uptime-check-config))))

(defn delete-uptime-check-config-callable
  "Deletes an uptime check configuration. Note that this method will fail if the uptime check
   configuration is referenced by an alert policy or other dependent configs that would be
   rendered invalid by the deletion.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfigName name = UptimeCheckConfigName.of(\"[PROJECT]\", \"[UPTIME_CHECK_CONFIG]\");
     DeleteUptimeCheckConfigRequest request = DeleteUptimeCheckConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = uptimeCheckServiceClient.deleteUptimeCheckConfigCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.deleteUptimeCheckConfigCallable))))

(defn close
  ""
  ([^UptimeCheckServiceClient this]
    (-> this (.close))))

(defn update-uptime-check-config-callable
  "Updates an uptime check configuration. You can either replace the entire configuration with a
   new one or replace only certain fields in the current configuration by specifying the fields to
   be updated via `\"updateMask\"`. Returns the updated configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
     UpdateUptimeCheckConfigRequest request = UpdateUptimeCheckConfigRequest.newBuilder()
       .setUptimeCheckConfig(uptimeCheckConfig)
       .build();
     ApiFuture<UptimeCheckConfig> future = uptimeCheckServiceClient.updateUptimeCheckConfigCallable().futureCall(request);
     // Do something
     UptimeCheckConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.updateUptimeCheckConfigCallable))))

(defn list-uptime-check-configs
  "Lists the existing valid uptime check configurations for the project, leaving out any invalid
   configurations.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     String formattedParent = ProjectName.format(\"[PROJECT]\");
     for (UptimeCheckConfig element : uptimeCheckServiceClient.listUptimeCheckConfigs(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The project whose uptime check configurations are listed. The format is `projects/[PROJECT_ID]`. - `java.lang.String`

  returns: `com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse [^UptimeCheckServiceClient this ^java.lang.String parent]
    (-> this (.listUptimeCheckConfigs parent))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^UptimeCheckServiceClient this]
    (-> this (.isTerminated))))

(defn delete-uptime-check-config
  "Deletes an uptime check configuration. Note that this method will fail if the uptime check
   configuration is referenced by an alert policy or other dependent configs that would be
   rendered invalid by the deletion.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfigName name = UptimeCheckConfigName.of(\"[PROJECT]\", \"[UPTIME_CHECK_CONFIG]\");
     uptimeCheckServiceClient.deleteUptimeCheckConfig(name);
   }

  name - The uptime check configuration to delete. The format is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`. - `com.google.monitoring.v3.UptimeCheckConfigName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^UptimeCheckServiceClient this ^com.google.monitoring.v3.UptimeCheckConfigName name]
    (-> this (.deleteUptimeCheckConfig name))))

(defn list-uptime-check-configs-paged-callable
  "Lists the existing valid uptime check configurations for the project, leaving out any invalid
   configurations.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     String formattedParent = ProjectName.format(\"[PROJECT]\");
     ListUptimeCheckConfigsRequest request = ListUptimeCheckConfigsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListUptimeCheckConfigsPagedResponse> future = uptimeCheckServiceClient.listUptimeCheckConfigsPagedCallable().futureCall(request);
     // Do something
     for (UptimeCheckConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceClient this]
    (-> this (.listUptimeCheckConfigsPagedCallable))))

(defn get-uptime-check-config
  "Gets a single uptime check configuration.

   Sample code:



   try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
     UptimeCheckConfigName name = UptimeCheckConfigName.of(\"[PROJECT]\", \"[UPTIME_CHECK_CONFIG]\");
     UptimeCheckConfig response = uptimeCheckServiceClient.getUptimeCheckConfig(name);
   }

  name - The uptime check configuration to retrieve. The format is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`. - `com.google.monitoring.v3.UptimeCheckConfigName`

  returns: `com.google.monitoring.v3.UptimeCheckConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.UptimeCheckConfig [^UptimeCheckServiceClient this ^com.google.monitoring.v3.UptimeCheckConfigName name]
    (-> this (.getUptimeCheckConfig name))))

(defn shutdown-now
  ""
  ([^UptimeCheckServiceClient this]
    (-> this (.shutdownNow))))

