(ns watt.csgo-servers-730 (:require [watt.core :refer [request]]))

(def
 game-servers-status-v1
 (partial request "GET" "ICSGOServers_730" "GetGameServersStatus" 1))

(def game-servers-status game-servers-status-v1)
