package com.graduationproject.invoforultimate.model;

import com.amap.api.track.query.entity.Point;

import java.util.List;

/**
 * Created by INvo
 * on 2020-02-10.
 */
public interface TrackReplayModel extends ModelResult {

    void onTrackPointsCallback(List<Point> pointList);

    void onTrackPointsResultCallback(String s);
}