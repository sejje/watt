(ns steam.econ-items-221540 (:require [steam.request :as r]))

(def
 player-items
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_221540" "GetPlayerItems" 1))
