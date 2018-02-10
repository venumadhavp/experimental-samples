package org.farrukh.experiments.dp.creational.abstractFactories.ch2;

import org.farrukh.experiments.dp.creational.abstractFactories.ch2.service.AbstractGameFactory;
import org.farrukh.experiments.dp.creational.abstractFactories.ch2.service.Ball;
import org.farrukh.experiments.dp.creational.abstractFactories.ch2.service.Player;

/**
 * @author Farrukhjon SATTOROV
 */
public class Match {

	private Player player;
	private Ball ball;

	public Match(AbstractGameFactory factory) {
		player = factory.makePlayer();
		ball = factory.makeObstacle();
	}

	public void play() {
		player.kick(ball);
	}
}
